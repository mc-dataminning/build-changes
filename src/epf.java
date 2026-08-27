import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class epf extends eox {
   public static final Codec<epf> a = RecordCodecBuilder.create($$0 -> a($$0).and(jo.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, epf::new));
   private final jo b;

   private epf(List<eql> $$0, jo $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eoz b() {
      return epa.h;
   }

   @Override
   public crs a(crs $$0, enk $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> eox.a<?> a(jq<T> $$0, T $$1) {
      return a($$2 -> new epf($$2, jo.a().a($$0, $$1).a()));
   }
}
