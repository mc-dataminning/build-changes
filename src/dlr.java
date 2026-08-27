import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dlr extends dha implements dkf {
   public static final MapCodec<dlr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dqw.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), u()).apply($$0, dlr::new)
   );
   public static final dqy b = dqx.u;
   public static final drf<drg> c = dqx.af;
   public static final dqy d = dqx.w;
   public static final dqy e = dqx.C;
   protected static final int f = 3;
   protected static final eui g = dde.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final eui h = dde.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eui i = dde.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eui j = dde.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final eui k = dde.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final eui l = dde.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dqw m;

   @Override
   public MapCodec<? extends dlr> a() {
      return a;
   }

   protected dlr(dqw $$0, dqg.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.k(this.E.b().a(aE, is.c).a(b, Boolean.valueOf(false)).a(c, drg.b).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == drg.a ? l : k;
      } else {
         switch ((is)$$0.c(aE)) {
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
   protected boolean a(dqh $$0, emp $$1) {
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
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if (!this.m.c()) {
         return bpm.d;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bpm.a($$1.B);
      }
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, czv $$3, BiConsumer<csz, in> $$4) {
      if ($$3.j() == czv.a.d && !$$1.x_() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dqh $$0, dad $$1, in $$2, @Nullable clh $$3) {
      dqh $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, emb.c, emb.c.a((dag)$$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable clh $$0, dad $$1, in $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), avd.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dva.h : dva.d, $$2);
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dde $$3, in $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.a(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, emb.c, emb.c.a((dag)$$1));
            }
         }
      }
   }

   @Override
   public dqh a(cwi $$0) {
      dqh $$1 = this.n();
      ema $$2 = $$0.q().b_($$0.a());
      is $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aE, $$3).a(c, $$0.l().d - (double)$$0.a().v() > 0.5 ? drg.a : drg.b);
      } else {
         $$1 = $$1.a(aE, $$0.g().g()).a(c, $$3 == is.b ? drg.b : drg.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.a(b, Boolean.valueOf(true)).a(d, Boolean.valueOf(true));
      }

      return $$1.a(e, Boolean.valueOf($$2.a() == emb.c));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(aE, b, c, d, e);
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(e) ? emb.c.a(false) : super.b_($$0);
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected dqw k() {
      return this.m;
   }
}
