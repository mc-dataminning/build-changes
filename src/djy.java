import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class djy extends dgv {
   public static final MapCodec<djy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lu.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), u()).apply($$0, djy::new)
   );
   private static final Map<dgv, dgv> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final eyx c = dgv.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final dgv e;

   @Override
   public MapCodec<djy> a() {
      return a;
   }

   public djy(dgv $$0, dtz.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return c;
   }

   @Override
   protected brk a(cvl $$0, dua $$1, dds $$2, je $$3, cnp $$4, brj $$5, eya $$6) {
      dua $$8 = ($$0.h() instanceof ctl $$7 ? d.getOrDefault($$7.d(), dgx.a) : dgx.a).o();
      if ($$8.l()) {
         return brk.f;
      } else if (!this.m()) {
         return brk.c;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, dyx.c, $$3);
         $$4.a(awn.ah);
         $$0.a(1, $$4);
         return brk.a;
      }
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if (this.m()) {
         return brk.c;
      } else {
         cvl $$5 = new cvl(this.e);
         if (!$$3.k($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dgx.fR.o(), 3);
         $$1.a($$3, dyx.c, $$2);
         return brk.a;
      }
   }

   @Override
   public cvl a(ddv $$0, je $$1, dua $$2) {
      return this.m() ? super.a($$0, $$1, $$2) : new cvl(this.e);
   }

   private boolean m() {
      return this.e == dgx.a;
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      return $$1 == jj.a && !$$0.a($$3, $$4) ? dgx.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public dgv b() {
      return this.e;
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }
}
