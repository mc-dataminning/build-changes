import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dnk extends dit implements dly {
   public static final MapCodec<dnk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsp.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), u()).apply($$0, dnk::new)
   );
   public static final dsr b = dsq.u;
   public static final dsy<dsz> c = dsq.af;
   public static final dsr d = dsq.w;
   public static final dsr e = dsq.C;
   protected static final int f = 3;
   protected static final ewi g = dex.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final ewi h = dex.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewi i = dex.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ewi j = dex.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final ewi k = dex.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final ewi l = dex.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dsp m;

   @Override
   public MapCodec<? extends dnk> a() {
      return a;
   }

   protected dnk(dsp $$0, drz.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.k(this.E.b().a(aE, je.c).a(b, Boolean.valueOf(false)).a(c, dsz.b).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dsz.a ? l : k;
      } else {
         switch ((je)$$0.c(aE)) {
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
   protected boolean a(dsa $$0, eoi $$1) {
      switch ($$1) {
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
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      if (!this.m.c()) {
         return bqs.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bqs.a($$1.B);
      }
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dbo $$3, BiConsumer<cun, iz> $$4) {
      if ($$3.j() == dbo.a.d && !$$1.x_() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dsa $$0, dbw $$1, iz $$2, @Nullable cmv $$3) {
      dsa $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, enu.c, enu.c.a((dbz)$$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cmv $$0, dbw $$1, iz $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), awa.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dwt.h : dwt.d, $$2);
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dex $$3, iz $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.a(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, enu.c, enu.c.a((dbz)$$1));
            }
         }
      }
   }

   @Override
   public dsa a(cxy $$0) {
      dsa $$1 = this.o();
      ent $$2 = $$0.q().b_($$0.a());
      je $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aE, $$3).a(c, $$0.l().d - (double)$$0.a().v() > 0.5 ? dsz.a : dsz.b);
      } else {
         $$1 = $$1.a(aE, $$0.g().g()).a(c, $$3 == je.b ? dsz.b : dsz.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.a(b, Boolean.valueOf(true)).a(d, Boolean.valueOf(true));
      }

      return $$1.a(e, Boolean.valueOf($$2.a() == enu.c));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(aE, b, c, d, e);
   }

   @Override
   protected ent b_(dsa $$0) {
      return $$0.c(e) ? enu.c.a(false) : super.b_($$0);
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, enu.c, enu.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected dsp m() {
      return this.m;
   }
}
