import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dmq extends djx implements dru {
   protected static final MapCodec<czr> b = czr.c.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dmq> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(b.forGetter(dmq::c), t()).apply($$0, dmq::new));
   protected static final float d = 3.0F;
   protected static final fbv e = djn.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final czr a;

   @Override
   public MapCodec<? extends dmq> a() {
      return c;
   }

   public dmq(jr<btp> $$0, float $$1, dwx.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dmq(czr $$0, dwx.d $$1) {
      super($$1);
      this.a = $$0;
   }

   protected static czr a(jr<btp> $$0, float $$1) {
      return new czr(List.of(new czr.a($$0, ayz.d($$1 * 20.0F))));
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      fbb $$4 = $$0.a($$2);
      return e.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   public czr c() {
      return this.a;
   }

   @Nullable
   public btr b() {
      return null;
   }
}
