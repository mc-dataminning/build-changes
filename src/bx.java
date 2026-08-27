import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;

public class bx extends cx<bx.a> {
   @Override
   public Codec<bx.a> a() {
      return bx.a.a;
   }

   public void a(aox $$0, cpd $$1, chz $$2, Collection<cpd> $$3) {
      ejc $$4 = br.b($$0, (bnq)($$2.u() != null ? $$2.u() : $$2));
      this.a($$0, $$3x -> $$3x.a($$1, $$4, $$3));
   }

   public static record a(Optional<bc> b, Optional<cc> c, Optional<bc> d, Optional<cc> e) implements cx.a {
      public static final Codec<bx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  avq.a(br.b, "player").forGetter(bx.a::a),
                  avq.a(cc.a, "rod").forGetter(bx.a::b),
                  avq.a(br.b, "entity").forGetter(bx.a::c),
                  avq.a(cc.a, "item").forGetter(bx.a::d)
               )
               .apply($$0, bx.a::new)
      );

      public static an<bx.a> a(Optional<cc> $$0, Optional<br> $$1, Optional<cc> $$2) {
         return am.E.a(new bx.a(Optional.empty(), $$0, br.a($$1), $$2));
      }

      public boolean a(cpd $$0, ejc $$1, Collection<cpd> $$2) {
         if (this.c.isPresent() && !this.c.get().a($$0)) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$1)) {
            return false;
         } else {
            if (this.e.isPresent()) {
               boolean $$3 = false;
               bnq $$4 = $$1.c(eln.a);
               if ($$4 instanceof cdw $$5 && this.e.get().a($$5.q())) {
                  $$3 = true;
               }

               for (cpd $$6 : $$2) {
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
