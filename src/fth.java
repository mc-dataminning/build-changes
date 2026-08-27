import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public interface fth {
   static fth.a a(epw $$0) {
      return a(ImmutableMap.of(), $$0);
   }

   static fth.a a(Map<ftp, epw> $$0, epw $$1) {
      return new fth.a($$1, $$0);
   }

   eqf getBuffer(ftp var1);

   public static class a implements fth {
      protected final epw a;
      protected final Map<ftp, epw> b;
      protected Optional<ftp> c = Optional.empty();
      protected final Set<epw> d = Sets.newHashSet();

      protected a(epw $$0, Map<ftp, epw> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public eqf getBuffer(ftp $$0) {
         Optional<ftp> $$1 = $$0.N();
         epw $$2 = this.b($$0);
         if (!Objects.equals(this.c, $$1) || !$$0.M()) {
            if (this.c.isPresent()) {
               ftp $$3 = this.c.get();
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

      private epw b(ftp $$0) {
         return this.b.getOrDefault($$0, this.a);
      }

      public void a() {
         if (this.c.isPresent()) {
            ftp $$0 = this.c.get();
            if (!this.b.containsKey($$0)) {
               this.a($$0);
            }

            this.c = Optional.empty();
         }
      }

      public void b() {
         this.c.ifPresent($$0x -> {
            eqf $$1 = this.getBuffer($$0x);
            if ($$1 == this.a) {
               this.a($$0x);
            }
         });

         for (ftp $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(ftp $$0) {
         epw $$1 = this.b($$0);
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
