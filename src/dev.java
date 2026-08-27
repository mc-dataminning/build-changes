import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dev extends dae implements ddj {
   public static final MapCodec<dev> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(djp.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), u()).apply($$0, dev::new)
   );
   public static final djr b = djq.u;
   public static final djy<djz> c = djq.af;
   public static final djr d = djq.w;
   public static final djr e = djq.C;
   protected static final int f = 3;
   protected static final emf g = cwj.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final emf h = cwj.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final emf i = cwj.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final emf j = cwj.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final emf k = cwj.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final emf l = cwj.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final djp m;

   @Override
   public MapCodec<? extends dev> a() {
      return a;
   }

   protected dev(djp $$0, diz.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.k(this.E.b().a(aE, ic.c).a(b, Boolean.valueOf(false)).a(c, djz.b).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == djz.a ? l : k;
      } else {
         switch ((ic)$$0.c(aE)) {
            case c:
            default:
               return j;
            case d:
               return i;
            case e:
               return h;
            case f:
               return g;
         }
      }
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      switch ($$3) {
         case a:
            return $$0.c(b);
         case b:
            return $$0.c(e);
         case c:
            return $$0.c(b);
         default:
            return false;
      }
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if (!this.m.c()) {
         return bjv.d;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bjv.a($$1.B);
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, cta $$3, BiConsumer<cmr, hx> $$4) {
      if ($$3.j() == cta.a.d && !$$1.y_() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dja $$0, cti $$1, hx $$2, @Nullable cfb $$3) {
      dja $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, eel.c, eel.c.a((ctl)$$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cfb $$0, cti $$1, hx $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), arn.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dnk.h : dnk.d, $$2);
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, cwj $$3, hx $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.a(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, eel.c, eel.c.a((ctl)$$1));
            }
         }
      }
   }

   @Override
   public dja a(cpa $$0) {
      dja $$1 = this.o();
      eek $$2 = $$0.q().b_($$0.a());
      ic $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aE, $$3).a(c, $$0.l().d - (double)$$0.a().v() > 0.5 ? djz.a : djz.b);
      } else {
         $$1 = $$1.a(aE, $$0.g().g()).a(c, $$3 == ic.b ? djz.b : djz.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.a(b, Boolean.valueOf(true)).a(d, Boolean.valueOf(true));
      }

      return $$1.a(e, Boolean.valueOf($$2.a() == eel.c));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(aE, b, c, d, e);
   }

   @Override
   public eek c_(dja $$0) {
      return $$0.c(e) ? eel.c.a(false) : super.c_($$0);
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eel.c, eel.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected djp g() {
      return this.m;
   }
}
