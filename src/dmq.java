import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dmq extends dea {
   public static final MapCodec<dmq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(le.e.q().fieldOf("hook").forGetter($$0x -> $$0x.m), u()).apply($$0, dmq::new)
   );
   public static final dru b = drt.w;
   public static final dru c = drt.a;
   public static final dru d = drt.d;
   public static final dru e = djo.b;
   public static final dru f = djo.c;
   public static final dru g = djo.d;
   public static final dru h = djo.e;
   private static final Map<it, dru> k = dfw.f;
   protected static final evf i = dea.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final evf j = dea.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final dea m;

   @Override
   public MapCodec<dmq> a() {
      return a;
   }

   public dmq(dea $$0, drc.d $$1) {
      super($$1);
      this.k(
         this.E
            .b()
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
            .a(f, Boolean.valueOf(false))
            .a(g, Boolean.valueOf(false))
            .a(h, Boolean.valueOf(false))
      );
      this.m = $$0;
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public drd a(cxb $$0) {
      daf $$1 = $$0.q();
      io $$2 = $$0.a();
      return this.n()
         .a(e, Boolean.valueOf(this.a($$1.a_($$2.e()), it.c)))
         .a(f, Boolean.valueOf(this.a($$1.a_($$2.h()), it.f)))
         .a(g, Boolean.valueOf(this.a($$1.a_($$2.f()), it.d)))
         .a(h, Boolean.valueOf(this.a($$1.a_($$2.g()), it.e)));
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      return $$1.o().d() ? $$0.a(k.get($$1), Boolean.valueOf(this.a($$2, $$1))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.a(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public drd a(daz $$0, io $$1, drd $$2, cly $$3) {
      if (!$$0.B && !$$3.eX().e() && $$3.eX().a(ctt.rV)) {
         $$0.a($$1, $$2.a(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, dvw.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(daz $$0, io $$1, drd $$2) {
      for (it $$3 : new it[]{it.d, it.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            io $$5 = $$1.a($$3, $$4);
            drd $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(dmr.b) == $$3.g()) {
                  dmr.a($$0, $$5, $$6, false, true, $$4, $$2);
               }
               break;
            }

            if (!$$6.a(this)) {
               break;
            }
         }
      }
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, brw $$3) {
      if (!$$1.B) {
         if (!$$0.c(b)) {
            this.a($$1, $$2);
         }
      }
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(daz $$0, io $$1) {
      drd $$2 = $$0.a_($$1);
      boolean $$3 = $$2.c(b);
      boolean $$4 = false;
      List<? extends brw> $$5 = $$0.a_(null, $$2.j($$0, $$1).a().a($$1));
      if (!$$5.isEmpty()) {
         for (brw $$6 : $$5) {
            if (!$$6.r_()) {
               $$4 = true;
               break;
            }
         }
      }

      if ($$4 != $$3) {
         $$2 = $$2.a(b, Boolean.valueOf($$4));
         $$0.a($$1, $$2, 3);
         this.a($$0, $$1, $$2);
      }

      if ($$4) {
         $$0.a(new io($$1), this, 10);
      }
   }

   public boolean a(drd $$0, it $$1) {
      return $$0.a(this.m) ? $$0.c(dmr.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      switch ($$1) {
         case c:
            return $$0.a(e, $$0.c(g)).a(f, $$0.c(h)).a(g, $$0.c(e)).a(h, $$0.c(f));
         case d:
            return $$0.a(e, $$0.c(f)).a(f, $$0.c(g)).a(g, $$0.c(h)).a(h, $$0.c(e));
         case b:
            return $$0.a(e, $$0.c(h)).a(f, $$0.c(e)).a(g, $$0.c(f)).a(h, $$0.c(g));
         default:
            return $$0;
      }
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      switch ($$1) {
         case b:
            return $$0.a(e, $$0.c(g)).a(g, $$0.c(e));
         case c:
            return $$0.a(f, $$0.c(h)).a(h, $$0.c(f));
         default:
            return super.a($$0, $$1);
      }
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
