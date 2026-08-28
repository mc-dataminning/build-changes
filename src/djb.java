import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class djb extends dfy {
   public static final MapCodec<djb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lt.e.r().fieldOf("potted").forGetter($$0x -> $$0x.e), u()).apply($$0, djb::new)
   );
   private static final Map<dfy, dfy> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final ext c = dfy.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final dfy e;

   @Override
   public MapCodec<djb> a() {
      return a;
   }

   public djb(dfy $$0, dtb.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return c;
   }

   @Override
   protected bqt a(cuq $$0, dtc $$1, dcw $$2, jd $$3, cmx $$4, bqq $$5, eww $$6) {
      dtc $$8 = ($$0.g() instanceof cso $$7 ? d.getOrDefault($$7.d(), dga.a) : dga.a).o();
      if ($$8.i()) {
         return bqt.d;
      } else if (!this.m()) {
         return bqt.b;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, dxz.c, $$3);
         $$4.a(avz.ah);
         $$0.a(1, $$4);
         return bqt.a($$2.B);
      }
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, eww $$4) {
      if (this.m()) {
         return bqr.c;
      } else {
         cuq $$5 = new cuq(this.e);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dga.fR.o(), 3);
         $$1.a($$3, dxz.c, $$2);
         return bqr.a($$1.B);
      }
   }

   @Override
   public cuq a(dcz $$0, jd $$1, dtc $$2) {
      return this.m() ? super.a($$0, $$1, $$2) : new cuq(this.e);
   }

   private boolean m() {
      return this.e == dga.a;
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      return $$1 == ji.a && !$$0.a($$3, $$4) ? dga.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public dfy b() {
      return this.e;
   }

   @Override
   protected boolean a(dtc $$0, epr $$1) {
      return false;
   }
}
