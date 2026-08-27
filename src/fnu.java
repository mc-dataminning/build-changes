import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public interface fnu {
   static fnu.a a(ela $$0) {
      return a(ImmutableMap.of(), $$0);
   }

   static fnu.a a(Map<foc, ela> $$0, ela $$1) {
      return new fnu.a($$1, $$0);
   }

   elj getBuffer(foc var1);

   public static class a implements fnu {
      protected final ela a;
      protected final Map<foc, ela> b;
      protected Optional<foc> c = Optional.empty();
      protected final Set<ela> d = Sets.newHashSet();

      protected a(ela $$0, Map<foc, ela> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public elj getBuffer(foc $$0) {
         Optional<foc> $$1 = $$0.O();
         ela $$2 = this.b($$0);
         if (!Objects.equals(this.c, $$1) || !$$0.N()) {
            if (this.c.isPresent()) {
               foc $$3 = this.c.get();
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

      private ela b(foc $$0) {
         return this.b.getOrDefault($$0, this.a);
      }

      public void a() {
         if (this.c.isPresent()) {
            foc $$0 = this.c.get();
            if (!this.b.containsKey($$0)) {
               this.a($$0);
            }

            this.c = Optional.empty();
         }
      }

      public void b() {
         this.c.ifPresent($$0x -> {
            elj $$1 = this.getBuffer($$0x);
            if ($$1 == this.a) {
               this.a($$0x);
            }
         });

         for (foc $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(foc $$0) {
         ela $$1 = this.b($$0);
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
