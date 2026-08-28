import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class etb extends esj {
   public static final MapCodec<etb> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eve.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, etb::new)
   );
   private final evd b;
   private final boolean c;

   private etb(List<euh> $$0, evd $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public esl<etb> b() {
      return esm.e;
   }

   @Override
   public Set<etp<?>> a() {
      return this.b.a();
   }

   @Override
   public cud a(cud $$0, eqw $$1) {
      int $$2 = this.c ? $$0.H() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static esj.a<?> a(evd $$0) {
      return a($$1 -> new etb($$1, $$0, false));
   }

   public static esj.a<?> a(evd $$0, boolean $$1) {
      return a($$2 -> new etb($$2, $$0, $$1));
   }
}
