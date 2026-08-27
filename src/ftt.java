import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public interface ftt {
   static ftt.a a(eqf $$0) {
      return a(ImmutableMap.of(), $$0);
   }

   static ftt.a a(Map<fub, eqf> $$0, eqf $$1) {
      return new ftt.a($$1, $$0);
   }

   eqo getBuffer(fub var1);

   public static class a implements ftt {
      protected final eqf a;
      protected final Map<fub, eqf> b;
      protected Optional<fub> c = Optional.empty();
      protected final Set<eqf> d = Sets.newHashSet();

      protected a(eqf $$0, Map<fub, eqf> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public eqo getBuffer(fub $$0) {
         Optional<fub> $$1 = $$0.N();
         eqf $$2 = this.b($$0);
         if (!Objects.equals(this.c, $$1) || !$$0.M()) {
            if (this.c.isPresent()) {
               fub $$3 = this.c.get();
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

      private eqf b(fub $$0) {
         return this.b.getOrDefault($$0, this.a);
      }

      public void a() {
         if (this.c.isPresent()) {
            fub $$0 = this.c.get();
            if (!this.b.containsKey($$0)) {
               this.a($$0);
            }

            this.c = Optional.empty();
         }
      }

      public void b() {
         this.c.ifPresent($$0x -> {
            eqo $$1 = this.getBuffer($$0x);
            if ($$1 == this.a) {
               this.a($$0x);
            }
         });

         for (fub $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(fub $$0) {
         eqf $$1 = this.b($$0);
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
