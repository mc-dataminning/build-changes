import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dfb extends dak implements ddp {
   public static final MapCodec<dfb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(djv.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), u()).apply($$0, dfb::new)
   );
   public static final djx b = djw.u;
   public static final dke<dkf> c = djw.af;
   public static final djx d = djw.w;
   public static final djx e = djw.C;
   protected static final int f = 3;
   protected static final eml g = cwp.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final eml h = cwp.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eml i = cwp.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eml j = cwp.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final eml k = cwp.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final eml l = cwp.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final djv m;

   @Override
   public MapCodec<? extends dfb> a() {
      return a;
   }

   protected dfb(djv $$0, djf.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.k(this.E.b().a(aE, ic.c).a(b, Boolean.valueOf(false)).a(c, dkf.b).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dkf.a ? l : k;
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
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
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
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      if (!this.m.c()) {
         return bka.d;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bka.a($$1.B);
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, ctg $$3, BiConsumer<cmx, hx> $$4) {
      if ($$3.j() == ctg.a.d && !$$1.y_() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(djg $$0, cto $$1, hx $$2, @Nullable cfh $$3) {
      djg $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, eer.c, eer.c.a((ctr)$$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cfh $$0, cto $$1, hx $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), ars.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dnq.h : dnq.d, $$2);
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, cwp $$3, hx $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.a(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, eer.c, eer.c.a((ctr)$$1));
            }
         }
      }
   }

   @Override
   public djg a(cpg $$0) {
      djg $$1 = this.o();
      eeq $$2 = $$0.q().b_($$0.a());
      ic $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aE, $$3).a(c, $$0.l().d - (double)$$0.a().v() > 0.5 ? dkf.a : dkf.b);
      } else {
         $$1 = $$1.a(aE, $$0.g().g()).a(c, $$3 == ic.b ? dkf.b : dkf.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.a(b, Boolean.valueOf(true)).a(d, Boolean.valueOf(true));
      }

      return $$1.a(e, Boolean.valueOf($$2.a() == eer.c));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(aE, b, c, d, e);
   }

   @Override
   public eeq c_(djg $$0) {
      return $$0.c(e) ? eer.c.a(false) : super.c_($$0);
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eer.c, eer.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected djv g() {
      return this.m;
   }
}
