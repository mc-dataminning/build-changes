import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dmn extends dhw implements dlb {
   public static final MapCodec<dmn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drs.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), u()).apply($$0, dmn::new)
   );
   public static final dru b = drt.u;
   public static final dsb<dsc> c = drt.af;
   public static final dru d = drt.w;
   public static final dru e = drt.C;
   protected static final int f = 3;
   protected static final evf g = dea.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final evf h = dea.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final evf i = dea.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final evf j = dea.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final evf k = dea.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final evf l = dea.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final drs m;

   @Override
   public MapCodec<? extends dmn> a() {
      return a;
   }

   protected dmn(drs $$0, drc.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.k(this.E.b().a(aE, it.c).a(b, Boolean.valueOf(false)).a(c, dsc.b).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dsc.a ? l : k;
      } else {
         switch ((it)$$0.c(aE)) {
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
   protected boolean a(drd $$0, enl $$1) {
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
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if (!this.m.c()) {
         return bpw.d;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bpw.a($$1.B);
      }
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, dar $$3, BiConsumer<ctq, io> $$4) {
      if ($$3.j() == dar.a.d && !$$1.x_() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(drd $$0, daz $$1, io $$2, @Nullable cly $$3) {
      drd $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, emx.c, emx.c.a((dbc)$$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cly $$0, daz $$1, io $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), avj.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dvw.h : dvw.d, $$2);
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, dea $$3, io $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.a(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, emx.c, emx.c.a((dbc)$$1));
            }
         }
      }
   }

   @Override
   public drd a(cxb $$0) {
      drd $$1 = this.n();
      emw $$2 = $$0.q().b_($$0.a());
      it $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aE, $$3).a(c, $$0.l().d - (double)$$0.a().v() > 0.5 ? dsc.a : dsc.b);
      } else {
         $$1 = $$1.a(aE, $$0.g().g()).a(c, $$3 == it.b ? dsc.b : dsc.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.a(b, Boolean.valueOf(true)).a(d, Boolean.valueOf(true));
      }

      return $$1.a(e, Boolean.valueOf($$2.a() == emx.c));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(aE, b, c, d, e);
   }

   @Override
   protected emw b_(drd $$0) {
      return $$0.c(e) ? emx.c.a(false) : super.b_($$0);
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected drs m() {
      return this.m;
   }
}
