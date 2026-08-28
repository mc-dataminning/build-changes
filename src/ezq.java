import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ezq extends eyy {
   public static final MapCodec<ezq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fbr.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, ezq::new)
   );
   private final fbq b;
   private final boolean c;

   private ezq(List<fau> $$0, fbq $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eza<ezq> b() {
      return ezb.e;
   }

   @Override
   public Set<bat<?>> a() {
      return this.b.a();
   }

   @Override
   public cxy a(cxy $$0, exl $$1) {
      int $$2 = this.c ? $$0.M() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static eyy.a<?> a(fbq $$0) {
      return a($$1 -> new ezq($$1, $$0, false));
   }

   public static eyy.a<?> a(fbq $$0, boolean $$1) {
      return a($$2 -> new ezq($$2, $$0, $$1));
   }
}
