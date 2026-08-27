import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dfj extends dcq implements dki {
   protected static final MapCodec<cur> a = cur.b.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dfj> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dfj::b), u()).apply($$0, dfj::new));
   protected static final float c = 3.0F;
   protected static final etc d = dch.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final cur e;

   @Override
   public MapCodec<? extends dfj> a() {
      return b;
   }

   public dfj(in<bpk> $$0, float $$1, dph.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dfj(cur $$0, dph.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static cur a(in<bpk> $$0, float $$1) {
      return new cur(List.of(new cur.a($$0, axm.d($$1 * 20.0F))));
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      esj $$4 = $$0.n($$1, $$2);
      return d.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public cur b() {
      return this.e;
   }
}
