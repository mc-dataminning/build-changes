import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dfa extends dch implements djz {
   protected static final MapCodec<cui> a = cui.b.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dfa> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dfa::b), u()).apply($$0, dfa::new));
   protected static final float c = 3.0F;
   protected static final est d = dby.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final cui e;

   @Override
   public MapCodec<? extends dfa> a() {
      return b;
   }

   public dfa(il<bpf> $$0, int $$1, doy.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dfa(cui $$0, doy.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static cui a(il<bpf> $$0, int $$1) {
      return new cui(List.of(new cui.a($$0, $$1 * 20)));
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      esa $$4 = $$0.n($$1, $$2);
      return d.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public cui b() {
      return this.e;
   }
}
