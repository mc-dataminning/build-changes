import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class etw extends eud {
   public static final MapCodec<etw> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, etw::new));

   private etw(int $$0, int $$1, List<eww> $$2, List<euz> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public euc a() {
      return etz.b;
   }

   @Override
   public void a(Consumer<cvs> $$0, etl $$1) {
   }

   public static eud.a<?> b() {
      return a(etw::new);
   }
}
