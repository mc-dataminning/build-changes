import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dkl extends dhs implements dpm {
   protected static final MapCodec<cyu> a = cyu.c.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dkl> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dkl::b), u()).apply($$0, dkl::new));
   protected static final float c = 3.0F;
   protected static final ezm d = dhj.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final cyu e;

   @Override
   public MapCodec<? extends dkl> a() {
      return b;
   }

   public dkl(jn<bst> $$0, float $$1, dun.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dkl(cyu $$0, dun.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static cyu a(jn<bst> $$0, float $$1) {
      return new cyu(List.of(new cyu.a($$0, azd.d($$1 * 20.0F))));
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      eys $$4 = $$0.a($$2);
      return d.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   public cyu b() {
      return this.e;
   }
}
