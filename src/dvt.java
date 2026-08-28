import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dvt extends dqs implements duc {
   public static final MapCodec<dvt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebi.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.h), t()).apply($$0, dvt::new)
   );
   public static final ebk b = ebj.y;
   public static final ebr<ebs> c = ebj.ai;
   public static final ebk d = ebj.A;
   public static final ebk f = ebj.I;
   private static final Map<jb, ffw> g = fft.d(dmr.c(16.0, 13.0, 16.0));
   private final ebi h;

   @Override
   public MapCodec<? extends dvt> a() {
      return a;
   }

   protected dvt(ebi $$0, eas.d $$1) {
      super($$1.a($$0.g()));
      this.h = $$0;
      this.l(this.C.b().b(e, jb.c).b(b, Boolean.valueOf(false)).b(c, ebs.b).b(d, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return g.get($$0.c(b) ? $$0.c(e) : ($$0.c(c) == ebs.a ? jb.a : jb.b));
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
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
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if (!this.h.c()) {
         return bug.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bug.a;
      }
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, djf $$3, BiConsumer<czn, iv> $$4) {
      if ($$3.g() && this.h.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(eat $$0, djm $$1, iv $$2, @Nullable crm $$3) {
      eat $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(f)) {
         $$1.a($$2, exb.c, exb.c.a($$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable crm $$0, djm $$1, iv $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.h.k() : this.h.j(), awo.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? eft.h : eft.d, $$2);
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, dmr $$3, @Nullable eyi $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.D($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.b(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(f)) {
               $$1.a($$2, exb.c, exb.c.a($$1));
            }
         }
      }
   }

   @Override
   public eat a(ddg $$0) {
      eat $$1 = this.m();
      exa $$2 = $$0.q().b_($$0.a());
      jb $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.b(e, $$3).b(c, $$0.l().e - (double)$$0.a().v() > 0.5 ? ebs.a : ebs.b);
      } else {
         $$1 = $$1.b(e, $$0.g().g()).b(c, $$3 == jb.b ? ebs.b : ebs.a);
      }

      if ($$0.q().D($$0.a())) {
         $$1 = $$1.b(b, Boolean.valueOf(true)).b(d, Boolean.valueOf(true));
      }

      return $$1.b(f, Boolean.valueOf($$2.a() == exb.c));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(e, b, c, d, f);
   }

   @Override
   protected exa b_(eat $$0) {
      return $$0.c(f) ? exb.c.a(false) : super.b_($$0);
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, exb.c, exb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected ebi q() {
      return this.h;
   }
}
