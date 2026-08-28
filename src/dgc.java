import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dgc(List<dgd> f, dgd g, dgd h) implements dfx {
   public static final MapCodec<dgc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dgd.a.listOf().fieldOf("ingredients").forGetter(dgc::b),
               dgd.a.fieldOf("result").forGetter(dgc::d),
               dgd.a.fieldOf("crafting_station").forGetter(dgc::e)
            )
            .apply($$0, dgc::new)
   );
   public static final za<wn, dgc> b = za.a(dgd.b.a(yy.a()), dgc::b, dgd.b, dgc::d, dgd.b, dgc::e, dgc::new);
   public static final dfx.a<dgc> c = new dfx.a<>(a, b);

   @Override
   public dfx.a<dgc> a() {
      return c;
   }

   @Override
   public boolean a(cvj $$0) {
      return this.f.stream().allMatch($$1 -> $$1.a($$0)) && dfx.super.a($$0);
   }

   public List<dgd> b() {
      return this.f;
   }

   @Override
   public dgd d() {
      return this.g;
   }

   @Override
   public dgd e() {
      return this.h;
   }
}
