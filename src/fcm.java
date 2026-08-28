import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fcm extends fbu {
   public static final MapCodec<fcm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fen.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, fcm::new)
   );
   private final fem b;
   private final boolean c;

   private fcm(List<fdq> $$0, fem $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fbw<fcm> b() {
      return fbx.e;
   }

   @Override
   public Set<baz<?>> a() {
      return this.b.a();
   }

   @Override
   public czy a(czy $$0, fah $$1) {
      int $$2 = this.c ? $$0.M() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static fbu.a<?> a(fem $$0) {
      return a($$1 -> new fcm($$1, $$0, false));
   }

   public static fbu.a<?> a(fem $$0, boolean $$1) {
      return a($$2 -> new fcm($$2, $$0, $$1));
   }
}
