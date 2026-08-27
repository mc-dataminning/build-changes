import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;

public class bx extends cx<bx.a> {
   @Override
   public Codec<bx.a> a() {
      return bx.a.a;
   }

   public void a(apg $$0, cqk $$1, cjg $$2, Collection<cqk> $$3) {
      eku $$4 = br.b($$0, (bow)($$2.s() != null ? $$2.s() : $$2));
      this.a($$0, $$3x -> $$3x.a($$1, $$4, $$3));
   }

   public static record a(Optional<bc> b, Optional<cc> c, Optional<bc> d, Optional<cc> e) implements cx.a {
      public static final Codec<bx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  awe.a(br.b, "player").forGetter(bx.a::a),
                  awe.a(cc.a, "rod").forGetter(bx.a::b),
                  awe.a(br.b, "entity").forGetter(bx.a::c),
                  awe.a(cc.a, "item").forGetter(bx.a::d)
               )
               .apply($$0, bx.a::new)
      );

      public static an<bx.a> a(Optional<cc> $$0, Optional<br> $$1, Optional<cc> $$2) {
         return am.E.a(new bx.a(Optional.empty(), $$0, br.a($$1), $$2));
      }

      public boolean a(cqk $$0, eku $$1, Collection<cqk> $$2) {
         if (this.c.isPresent() && !this.c.get().a($$0)) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$1)) {
            return false;
         } else {
            if (this.e.isPresent()) {
               boolean $$3 = false;
               bow $$4 = $$1.c(enf.a);
               if ($$4 instanceof cfd $$5 && this.e.get().a($$5.p())) {
                  $$3 = true;
               }

               for (cqk $$6 : $$2) {
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
      public void a(bd $$0) {
         cx.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<cc> b() {
         return this.c;
      }

      public Optional<bc> c() {
         return this.d;
      }

      public Optional<cc> d() {
         return this.e;
      }
   }
}
