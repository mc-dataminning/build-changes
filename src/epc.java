import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class epc implements eoy {
   public static final Codec<epc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(epa.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, epc::new)
   );
   public static final Codec<epc> b = epa.b.listOf().xmap(epc::new, $$0 -> $$0.c);
   private final List<eoy> c;
   private final BiFunction<crs, enk, crs> d;

   private epc(List<eoy> $$0) {
      this.c = $$0;
      this.d = epa.a($$0);
   }

   public static epc a(List<eoy> $$0) {
      return new epc(List.copyOf($$0));
   }

   public crs a(crs $$0, enk $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(ent $$0) {
      eoy.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public eoz b() {
      return epa.D;
   }
}
