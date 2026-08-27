import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public interface foa {
   static foa.a a(ele $$0) {
      return a(ImmutableMap.of(), $$0);
   }

   static foa.a a(Map<foi, ele> $$0, ele $$1) {
      return new foa.a($$1, $$0);
   }

   eln getBuffer(foi var1);

   public static class a implements foa {
      protected final ele a;
      protected final Map<foi, ele> b;
      protected Optional<foi> c = Optional.empty();
      protected final Set<ele> d = Sets.newHashSet();

      protected a(ele $$0, Map<foi, ele> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public eln getBuffer(foi $$0) {
         Optional<foi> $$1 = $$0.O();
         ele $$2 = this.b($$0);
         if (!Objects.equals(this.c, $$1) || !$$0.N()) {
            if (this.c.isPresent()) {
               foi $$3 = this.c.get();
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

      private ele b(foi $$0) {
         return this.b.getOrDefault($$0, this.a);
      }

      public void a() {
         if (this.c.isPresent()) {
            foi $$0 = this.c.get();
            if (!this.b.containsKey($$0)) {
               this.a($$0);
            }

            this.c = Optional.empty();
         }
      }

      public void b() {
         this.c.ifPresent($$0x -> {
            eln $$1 = this.getBuffer($$0x);
            if ($$1 == this.a) {
               this.a($$0x);
            }
         });

         for (foi $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(foi $$0) {
         ele $$1 = this.b($$0);
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
