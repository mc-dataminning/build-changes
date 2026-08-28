import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dsx extends dod implements drl {
   public static final MapCodec<dsx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyf.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.h), t()).apply($$0, dsx::new)
   );
   public static final dyh b = dyg.y;
   public static final dyo<dyp> c = dyg.ai;
   public static final dyh d = dyg.A;
   public static final dyh f = dyg.I;
   private static final Map<jn, fcr> g = fco.d(dke.c(16.0, 13.0, 16.0));
   private final dyf h;

   @Override
   public MapCodec<? extends dsx> a() {
      return a;
   }

   protected dsx(dyf $$0, dxp.d $$1) {
      super($$1.a($$0.g()));
      this.h = $$0;
      this.l(this.B.b().b(e, jn.c).b(b, Boolean.valueOf(false)).b(c, dyp.b).b(d, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return g.get($$0.c(b) ? $$0.c(e) : ($$0.c(c) == dyp.a ? jn.a : jn.b));
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
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
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if (!this.h.c()) {
         return bsy.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bsy.a;
      }
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, dgs $$3, BiConsumer<cxh, ji> $$4) {
      if ($$3.g() && this.h.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dxq $$0, dgz $$1, ji $$2, @Nullable cpr $$3) {
      dxq $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(f)) {
         $$1.a($$2, etx.c, etx.c.a($$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cpr $$0, dgz $$1, ji $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.h.k() : this.h.j(), awb.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? ecp.h : ecp.d, $$2);
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dke $$3, @Nullable eve $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.b(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(f)) {
               $$1.a($$2, etx.c, etx.c.a($$1));
            }
         }
      }
   }

   @Override
   public dxq a(dax $$0) {
      dxq $$1 = this.m();
      etw $$2 = $$0.q().b_($$0.a());
      jn $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.b(e, $$3).b(c, $$0.l().e - (double)$$0.a().v() > 0.5 ? dyp.a : dyp.b);
      } else {
         $$1 = $$1.b(e, $$0.g().g()).b(c, $$3 == jn.b ? dyp.b : dyp.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.b(b, Boolean.valueOf(true)).b(d, Boolean.valueOf(true));
      }

      return $$1.b(f, Boolean.valueOf($$2.a() == etx.c));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(e, b, c, d, f);
   }

   @Override
   protected etw b_(dxq $$0) {
      return $$0.c(f) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected dyf q() {
      return this.h;
   }
}
