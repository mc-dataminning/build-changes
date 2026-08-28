import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dtp extends dot implements dsb {
   public static final MapCodec<dtp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dzb.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.h), t()).apply($$0, dtp::new)
   );
   public static final dzd b = dzc.y;
   public static final dzk<dzl> c = dzc.ai;
   public static final dzd d = dzc.A;
   public static final dzd f = dzc.I;
   private static final Map<jo, fdo> g = fdl.d(dku.c(16.0, 13.0, 16.0));
   private final dzb h;

   @Override
   public MapCodec<? extends dtp> a() {
      return a;
   }

   protected dtp(dzb $$0, dyl.d $$1) {
      super($$1.a($$0.g()));
      this.h = $$0;
      this.l(this.B.b().b(e, jo.c).b(b, Boolean.valueOf(false)).b(c, dzl.b).b(d, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return g.get($$0.c(b) ? $$0.c(e) : ($$0.c(c) == dzl.a ? jo.a : jo.b));
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      switch ($$1) {
         case a:
            return $$0.c(b);
         case b:
            return $$0.c(f);
         case c:
            return $$0.c(b);
         default:
            return false;
      }
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if (!this.h.c()) {
         return btq.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return btq.a;
      }
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, dhi $$3, BiConsumer<cxy, jj> $$4) {
      if ($$3.g() && this.h.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dym $$0, dhp $$1, jj $$2, @Nullable cqi $$3) {
      dym $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(f)) {
         $$1.a($$2, euu.c, euu.c.a($$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cqi $$0, dhp $$1, jj $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.h.k() : this.h.j(), awl.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? edm.h : edm.d, $$2);
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dku $$3, @Nullable ewb $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.b(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(f)) {
               $$1.a($$2, euu.c, euu.c.a($$1));
            }
         }
      }
   }

   @Override
   public dym a(dbn $$0) {
      dym $$1 = this.m();
      eut $$2 = $$0.q().b_($$0.a());
      jo $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.b(e, $$3).b(c, $$0.l().e - (double)$$0.a().v() > 0.5 ? dzl.a : dzl.b);
      } else {
         $$1 = $$1.b(e, $$0.g().g()).b(c, $$3 == jo.b ? dzl.b : dzl.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.b(b, Boolean.valueOf(true)).b(d, Boolean.valueOf(true));
      }

      return $$1.b(f, Boolean.valueOf($$2.a() == euu.c));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(e, b, c, d, f);
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(f) ? euu.c.a(false) : super.b_($$0);
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected dzb q() {
      return this.h;
   }
}
