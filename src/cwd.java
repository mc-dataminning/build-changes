import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class cwd extends ctc {
   public static final MapCodec<cwd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jb.f.q().fieldOf("potted").forGetter($$0x -> $$0x.e), t()).apply($$0, cwd::new)
   );
   private static final Map<ctc, ctc> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final eia c = ctc.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final ctc e;

   @Override
   public MapCodec<cwd> a() {
      return a;
   }

   public cwd(ctc $$0, dfc.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return c;
   }

   @Override
   public czg b_(dfd $$0) {
      return czg.c;
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      cjl $$6 = $$3.b($$4);
      cjg $$7 = $$6.d();
      dfd $$8 = ($$7 instanceof che ? d.getOrDefault(((che)$$7).e(), cte.a) : cte.a).o();
      boolean $$9 = $$8.a(cte.a);
      boolean $$10 = this.g();
      if ($$9 != $$10) {
         if ($$10) {
            $$1.a($$2, $$8, 3);
            $$3.a(apq.ah);
            if (!$$3.fT().d) {
               $$6.h(1);
            }
         } else {
            cjl $$11 = new cjl(this.e);
            if ($$6.b()) {
               $$3.a($$4, $$11);
            } else if (!$$3.i($$11)) {
               $$3.a($$11, false);
            }

            $$1.a($$2, cte.fR.o(), 3);
         }

         $$1.a($$3, djn.c, $$2);
         return bhe.a($$1.B);
      } else {
         return bhe.b;
      }
   }

   @Override
   public cjl a(cqe $$0, gw $$1, dfd $$2) {
      return this.g() ? super.a($$0, $$1, $$2) : new cjl(this.e);
   }

   private boolean g() {
      return this.e == cte.a;
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      return $$1 == ha.a && !$$0.a($$3, $$4) ? cte.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ctc b() {
      return this.e;
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }
}
