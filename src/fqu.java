import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public interface fqu {
   static fqu.a a(enr $$0) {
      return a(ImmutableMap.of(), $$0);
   }

   static fqu.a a(Map<frc, enr> $$0, enr $$1) {
      return new fqu.a($$1, $$0);
   }

   eoa getBuffer(frc var1);

   public static class a implements fqu {
      protected final enr a;
      protected final Map<frc, enr> b;
      protected Optional<frc> c = Optional.empty();
      protected final Set<enr> d = Sets.newHashSet();

      protected a(enr $$0, Map<frc, enr> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public eoa getBuffer(frc $$0) {
         Optional<frc> $$1 = $$0.N();
         enr $$2 = this.b($$0);
         if (!Objects.equals(this.c, $$1) || !$$0.M()) {
            if (this.c.isPresent()) {
               frc $$3 = this.c.get();
               if (!this.b.containsKey($$3)) {
                  this.a($$3);
               }
            }

            if (this.d.add($$2)) {
               $$2.a($$0.I(), $$0.H());
            }

            this.c = $$1;
         }

         return $$2;
      }

      private enr b(frc $$0) {
         return this.b.getOrDefault($$0, this.a);
      }

      public void a() {
         if (this.c.isPresent()) {
            frc $$0 = this.c.get();
            if (!this.b.containsKey($$0)) {
               this.a($$0);
            }

            this.c = Optional.empty();
         }
      }

      public void b() {
         this.c.ifPresent($$0x -> {
            eoa $$1 = this.getBuffer($$0x);
            if ($$1 == this.a) {
               this.a($$0x);
            }
         });

         for (frc $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(frc $$0) {
         enr $$1 = this.b($$0);
         boolean $$2 = Objects.equals(this.c, $$0.N());
         if ($$2 || $$1 != this.a) {
            if (this.d.remove($$1)) {
               $$0.a($$1, RenderSystem.getVertexSorting());
               if ($$2) {
                  this.c = Optional.empty();
               }
            }
         }
      }
   }
}
