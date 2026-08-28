import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dno extends dkv implements dsq {
   protected static final MapCodec<dap> a = dap.c.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dno> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dno::b), t()).apply($$0, dno::new));
   protected static final float c = 3.0F;
   protected static final fcr d = dkl.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final dap e;

   @Override
   public MapCodec<? extends dno> a() {
      return b;
   }

   public dno(jq<bum> $$0, float $$1, dxt.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dno(dap $$0, dxt.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static dap a(jq<bum> $$0, float $$1) {
      return new dap(List.of(new dap.a($$0, bae.d($$1 * 20.0F))));
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      fbx $$4 = $$0.a($$2);
      return d.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   public dap b() {
      return this.e;
   }
}
