import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public interface fng {
   static fng.a a(elc $$0) {
      return a(ImmutableMap.of(), $$0);
   }

   static fng.a a(Map<fno, elc> $$0, elc $$1) {
      return new fng.a($$1, $$0);
   }

   ell getBuffer(fno var1);

   public static class a implements fng {
      protected final elc a;
      protected final Map<fno, elc> b;
      protected Optional<fno> c = Optional.empty();
      protected final Set<elc> d = Sets.newHashSet();

      protected a(elc $$0, Map<fno, elc> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public ell getBuffer(fno $$0) {
         Optional<fno> $$1 = $$0.O();
         elc $$2 = this.b($$0);
         if (!Objects.equals(this.c, $$1) || !$$0.N()) {
            if (this.c.isPresent()) {
               fno $$3 = this.c.get();
               if (!this.b.containsKey($$3)) {
                  this.a($$3);
               }
            }

            if (this.d.add($$2)) {
               $$2.a($$0.J(), $$0.I());
            }

            this.c = $$1;
         }

         return $$2;
      }

      private elc b(fno $$0) {
         return this.b.getOrDefault($$0, this.a);
      }

      public void a() {
         if (this.c.isPresent()) {
            fno $$0 = this.c.get();
            if (!this.b.containsKey($$0)) {
               this.a($$0);
            }

            this.c = Optional.empty();
         }
      }

      public void b() {
         this.c.ifPresent($$0x -> {
            ell $$1 = this.getBuffer($$0x);
            if ($$1 == this.a) {
               this.a($$0x);
            }
         });

         for (fno $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(fno $$0) {
         elc $$1 = this.b($$0);
         boolean $$2 = Objects.equals(this.c, $$0.O());
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
