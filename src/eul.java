import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class eul implements euh {
   public static final MapCodec<eul> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(euj.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, eul::new)
   );
   public static final Codec<eul> b = euj.b.listOf().xmap(eul::new, $$0 -> $$0.c);
   private final List<euh> c;
   private final BiFunction<cvl, est, cvl> d;

   private eul(List<euh> $$0) {
      this.c = $$0;
      this.d = euj.a($$0);
   }

   public static eul a(List<euh> $$0) {
      return new eul(List.copyOf($$0));
   }

   public cvl a(cvl $$0, est $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(esz $$0) {
      euh.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public eui<eul> b() {
      return euj.I;
   }
}
