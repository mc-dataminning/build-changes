import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class daa extends cxh implements dez {
   protected static final MapCodec<List<dez.a>> a = dez.a.b.fieldOf("suspicious_stew_effects");
   public static final MapCodec<daa> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(daa::b), u()).apply($$0, daa::new));
   protected static final float c = 3.0F;
   protected static final emv d = cwy.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final List<dez.a> e;

   @Override
   public MapCodec<? extends daa> a() {
      return b;
   }

   public daa(ih<blh> $$0, int $$1, djo.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public daa(List<dez.a> $$0, djo.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static List<dez.a> a(ih<blh> $$0, int $$1) {
      return List.of(new dez.a($$0, $$1 * 20));
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      emc $$4 = $$0.n($$1, $$2);
      return d.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public List<dez.a> b() {
      return this.e;
   }
}
