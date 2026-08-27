import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dbu extends czb implements dgt {
   protected static final MapCodec<List<dgt.a>> a = dgt.a.b.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dbu> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dbu::b), u()).apply($$0, dbu::new));
   protected static final float c = 3.0F;
   protected static final eos d = cys.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final List<dgt.a> e;

   @Override
   public MapCodec<? extends dbu> a() {
      return b;
   }

   public dbu(ij<bnb> $$0, int $$1, dli.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dbu(List<dgt.a> $$0, dli.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static List<dgt.a> a(ij<bnb> $$0, int $$1) {
      return List.of(new dgt.a($$0, $$1 * 20));
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      enz $$4 = $$0.n($$1, $$2);
      return d.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public List<dgt.a> b() {
      return this.e;
   }
}
