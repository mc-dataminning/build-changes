import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dkz extends dih implements dqa {
   protected static final MapCodec<cyw> a = cyw.c.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dkz> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dkz::b), t()).apply($$0, dkz::new));
   protected static final float c = 3.0F;
   protected static final fab d = dhy.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final cyw e;

   @Override
   public MapCodec<? extends dkz> a() {
      return b;
   }

   public dkz(jp<btc> $$0, float $$1, dvc.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dkz(cyw $$0, dvc.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static cyw a(jp<btc> $$0, float $$1) {
      return new cyw(List.of(new cyw.a($$0, azj.d($$1 * 20.0F))));
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      ezh $$4 = $$0.a($$2);
      return d.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   public cyw b() {
      return this.e;
   }
}
