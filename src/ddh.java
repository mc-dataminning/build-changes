import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddh(buh c, jp<awj> d, Optional<alh> e, Optional<jt<bug<?>>> f, boolean g) {
   public static final Codec<ddh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               buh.k.fieldOf("slot").forGetter(ddh::a),
               awj.b.optionalFieldOf("equip_sound", awk.as).forGetter(ddh::b),
               alh.a.optionalFieldOf("model").forGetter(ddh::c),
               ke.a(ly.z).optionalFieldOf("allowed_entities").forGetter(ddh::d),
               Codec.BOOL.optionalFieldOf("dispensable", true).forGetter(ddh::e)
            )
            .apply($$0, ddh::new)
   );
   public static final zf<ws, ddh> b = zf.a(buh.l, ddh::a, awj.d, ddh::b, alh.b.a(zd::a), ddh::c, zd.c(ly.z).a(zd::a), ddh::d, zd.b, ddh::e, ddh::new);

   public static ddh a(cuu $$0) {
      return new ddh(buh.g, awk.of, Optional.of(ddg.j.get($$0)), Optional.of(jt.a(bug::r, bug.an, bug.be)), true);
   }

   public bry a(cvx $$0, coh $$1) {
      if (!$$1.e(this.c)) {
         return bry.e;
      } else {
         cvx $$2 = $$1.a(this.c);
         if ((!dbo.a($$2, dbn.E) || $$1.f()) && !cvx.c($$0, $$2)) {
            if (!$$1.dX().y_()) {
               $$1.b(awu.c.b($$0.h()));
            }

            if ($$0.L() <= 1) {
               cvx $$3 = $$2.f() ? $$0 : $$2.g();
               cvx $$4 = $$1.f() ? $$0.v() : $$0.g();
               $$1.a(this.c, $$4);
               return bry.a.a($$3);
            } else {
               cvx $$5 = $$2.g();
               cvx $$6 = $$0.b(1, $$1);
               $$1.a(this.c, $$6);
               if (!$$1.gk().f($$5)) {
                  $$1.a($$5, false);
               }

               return bry.a.a($$0);
            }
         } else {
            return bry.d;
         }
      }
   }

   public boolean a(bug<?> $$0) {
      return this.f.isEmpty() || this.f.get().a($$0.r());
   }

   public buh a() {
      return this.c;
   }

   public jp<awj> b() {
      return this.d;
   }

   public Optional<alh> c() {
      return this.e;
   }

   public Optional<jt<bug<?>>> d() {
      return this.f;
   }

   public boolean e() {
      return this.g;
   }
}
