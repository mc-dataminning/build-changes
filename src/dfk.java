import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dfk extends dch {
   public static final MapCodec<dfk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kt.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), u()).apply($$0, dfk::new)
   );
   private static final Map<dch, dch> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final etc c = dch.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final dch e;

   @Override
   public MapCodec<dfk> a() {
      return a;
   }

   public dfk(dch $$0, dph.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return c;
   }

   @Override
   protected boh a(crs $$0, dpi $$1, czg $$2, id $$3, cka $$4, boe $$5, esf $$6) {
      dpi $$8 = ($$0.f() instanceof cpq $$7 ? d.getOrDefault($$7.d(), dcj.a) : dcj.a).n();
      if ($$8.i()) {
         return boh.d;
      } else if (!this.k()) {
         return boh.b;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, dub.c, $$3);
         $$4.a(auz.ah);
         $$0.a(1, $$4);
         return boh.a($$2.B);
      }
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if (this.k()) {
         return bof.b;
      } else {
         crs $$5 = new crs(this.e);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dcj.fR.n(), 3);
         $$1.a($$3, dub.c, $$2);
         return bof.a($$1.B);
      }
   }

   @Override
   public crs a(czj $$0, id $$1, dpi $$2) {
      return this.k() ? super.a($$0, $$1, $$2) : new crs(this.e);
   }

   private boolean k() {
      return this.e == dcj.a;
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      return $$1 == ij.a && !$$0.a($$3, $$4) ? dcj.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public dch b() {
      return this.e;
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }
}
