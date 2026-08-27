import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public interface fnz {
   static fnz.a a(elf $$0) {
      return a(ImmutableMap.of(), $$0);
   }

   static fnz.a a(Map<foh, elf> $$0, elf $$1) {
      return new fnz.a($$1, $$0);
   }

   elo getBuffer(foh var1);

   public static class a implements fnz {
      protected final elf a;
      protected final Map<foh, elf> b;
      protected Optional<foh> c = Optional.empty();
      protected final Set<elf> d = Sets.newHashSet();

      protected a(elf $$0, Map<foh, elf> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public elo getBuffer(foh $$0) {
         Optional<foh> $$1 = $$0.O();
         elf $$2 = this.b($$0);
         if (!Objects.equals(this.c, $$1) || !$$0.N()) {
            if (this.c.isPresent()) {
               foh $$3 = this.c.get();
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

      private elf b(foh $$0) {
         return this.b.getOrDefault($$0, this.a);
      }

      public void a() {
         if (this.c.isPresent()) {
            foh $$0 = this.c.get();
            if (!this.b.containsKey($$0)) {
               this.a($$0);
            }

            this.c = Optional.empty();
         }
      }

      public void b() {
         this.c.ifPresent($$0x -> {
            elo $$1 = this.getBuffer($$0x);
            if ($$1 == this.a) {
               this.a($$0x);
            }
         });

         for (foh $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(foh $$0) {
         elf $$1 = this.b($$0);
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
