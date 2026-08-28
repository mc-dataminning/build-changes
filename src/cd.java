import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;

public class cd extends dy<cd.a> {
   @Override
   public Codec<cd.a> a() {
      return cd.a.a;
   }

   public void a(arq $$0, cwm $$1, cpj $$2, Collection<cwm> $$3) {
      eun $$4 = bw.b($$0, (bul)($$2.n() != null ? $$2.n() : $$2));
      this.a($$0, $$3x -> $$3x.a($$1, $$4, $$3));
   }

   public static record a(Optional<bh> b, Optional<cu> c, Optional<bh> d, Optional<cu> e) implements dy.a {
      public static final Codec<cd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bw.b.optionalFieldOf("player").forGetter(cd.a::a),
                  cu.a.optionalFieldOf("rod").forGetter(cd.a::b),
                  bw.b.optionalFieldOf("entity").forGetter(cd.a::c),
                  cu.a.optionalFieldOf("item").forGetter(cd.a::d)
               )
               .apply($$0, cd.a::new)
      );

      public static ap<cd.a> a(Optional<cu> $$0, Optional<bw> $$1, Optional<cu> $$2) {
         return ao.E.a(new cd.a(Optional.empty(), $$0, bw.a($$1), $$2));
      }

      public boolean a(cwm $$0, eun $$1, Collection<cwm> $$2) {
         if (this.c.isPresent() && !this.c.get().a($$0)) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$1)) {
            return false;
         } else {
            if (this.e.isPresent()) {
               boolean $$3 = false;
               bul $$4 = $$1.c(exj.a);
               if ($$4 instanceof clc $$5 && this.e.get().a($$5.j())) {
                  $$3 = true;
               }

               for (cwm $$6 : $$2) {
                  if (this.e.get().a($$6)) {
                     $$3 = true;
                     break;
                  }
               }

               if (!$$3) {
                  return false;
               }
            }

            return true;
         }
      }

      @Override
      public void a(bi $$0) {
         dy.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }

      public Optional<cu> b() {
         return this.c;
      }

      public Optional<bh> c() {
         return this.d;
      }

      public Optional<cu> d() {
         return this.e;
      }
   }
}
