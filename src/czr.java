import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class czr extends cwy implements deq {
   protected static final MapCodec<List<deq.a>> a = deq.a.b.fieldOf("suspicious_stew_effects");
   public static final MapCodec<czr> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(czr::b), u()).apply($$0, czr::new));
   protected static final float c = 3.0F;
   protected static final eml d = cwp.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final List<deq.a> e;

   @Override
   public MapCodec<? extends czr> a() {
      return b;
   }

   public czr(blf $$0, int $$1, djf.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public czr(List<deq.a> $$0, djf.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static List<deq.a> a(blf $$0, int $$1) {
      int $$2;
      if ($$0.a()) {
         $$2 = $$1;
      } else {
         $$2 = $$1 * 20;
      }

      return List.of(new deq.a($$0, $$2));
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      els $$4 = $$0.n($$1, $$2);
      return d.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public List<deq.a> b() {
      return this.e;
   }
}
