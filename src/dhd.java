import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dhd extends dea {
   public static final MapCodec<dhd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(le.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), u()).apply($$0, dhd::new)
   );
   private static final Map<dea, dea> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final evf c = dea.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final dea e;

   @Override
   public MapCodec<dhd> a() {
      return a;
   }

   public dhd(dea $$0, drc.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return c;
   }

   @Override
   protected bpy a(ctq $$0, drd $$1, daz $$2, io $$3, cly $$4, bpv $$5, eui $$6) {
      drd $$8 = ($$0.g() instanceof cro $$7 ? d.getOrDefault($$7.d(), dec.a) : dec.a).n();
      if ($$8.i()) {
         return bpy.d;
      } else if (!this.m()) {
         return bpy.b;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, dvw.c, $$3);
         $$4.a(avs.ah);
         $$0.a(1, $$4);
         return bpy.a($$2.B);
      }
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if (this.m()) {
         return bpw.b;
      } else {
         ctq $$5 = new ctq(this.e);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dec.fR.n(), 3);
         $$1.a($$3, dvw.c, $$2);
         return bpw.a($$1.B);
      }
   }

   @Override
   public ctq a(dbc $$0, io $$1, drd $$2) {
      return this.m() ? super.a($$0, $$1, $$2) : new ctq(this.e);
   }

   private boolean m() {
      return this.e == dec.a;
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      return $$1 == it.a && !$$0.a($$3, $$4) ? dec.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public dea b() {
      return this.e;
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }
}
