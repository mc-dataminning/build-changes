import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dfk extends dat implements ddy {
   public static final MapCodec<dfk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dke.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), u()).apply($$0, dfk::new)
   );
   public static final dkg b = dkf.u;
   public static final dkn<dko> c = dkf.af;
   public static final dkg d = dkf.w;
   public static final dkg e = dkf.C;
   protected static final int f = 3;
   protected static final emv g = cwy.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final emv h = cwy.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final emv i = cwy.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final emv j = cwy.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final emv k = cwy.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final emv l = cwy.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dke m;

   @Override
   public MapCodec<? extends dfk> a() {
      return a;
   }

   protected dfk(dke $$0, djo.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.k(this.E.b().a(aE, ic.c).a(b, Boolean.valueOf(false)).a(c, dko.b).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dko.a ? l : k;
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
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
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
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if (!this.m.c()) {
         return bkc.d;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bkc.a($$1.B);
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, ctp $$3, BiConsumer<cng, hx> $$4) {
      if ($$3.j() == ctp.a.d && !$$1.y_() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(djp $$0, ctx $$1, hx $$2, @Nullable cfq $$3) {
      djp $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, efa.c, efa.c.a((cua)$$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cfq $$0, ctx $$1, hx $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), aru.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dnz.h : dnz.d, $$2);
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, cwy $$3, hx $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.a(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, efa.c, efa.c.a((cua)$$1));
            }
         }
      }
   }

   @Override
   public djp a(cpp $$0) {
      djp $$1 = this.o();
      eez $$2 = $$0.q().b_($$0.a());
      ic $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aE, $$3).a(c, $$0.l().d - (double)$$0.a().v() > 0.5 ? dko.a : dko.b);
      } else {
         $$1 = $$1.a(aE, $$0.g().g()).a(c, $$3 == ic.b ? dko.b : dko.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.a(b, Boolean.valueOf(true)).a(d, Boolean.valueOf(true));
      }

      return $$1.a(e, Boolean.valueOf($$2.a() == efa.c));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(aE, b, c, d, e);
   }

   @Override
   public eez c_(djp $$0) {
      return $$0.c(e) ? efa.c.a(false) : super.c_($$0);
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, efa.c, efa.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected dke g() {
      return this.m;
   }
}
