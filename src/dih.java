import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dih extends dfo implements dnh {
   protected static final MapCodec<cxd> a = cxd.b.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dih> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dih::b), u()).apply($$0, dih::new));
   protected static final float c = 3.0F;
   protected static final ews d = dff.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final cxd e;

   @Override
   public MapCodec<? extends dih> a() {
      return b;
   }

   public dih(jj<brj> $$0, float $$1, dsg.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dih(cxd $$0, dsg.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static cxd a(jj<brj> $$0, float $$1) {
      return new cxd(List.of(new cxd.a($$0, aye.d($$1 * 20.0F))));
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      evz $$4 = $$0.n($$1, $$2);
      return d.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public cxd b() {
      return this.e;
   }
}
