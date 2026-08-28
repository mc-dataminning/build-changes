import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejr implements ejv {
   public static final Codec<ejr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dym.a.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dym.a.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bsv.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bsv.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ejr::new)
   );
   private final dym b;
   private final dym c;
   private final bsv d;
   private final bsv e;

   public ejr(dym $$0, dym $$1, bsv $$2, bsv $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dym a() {
      return this.b;
   }

   public dym b() {
      return this.c;
   }

   public bsv c() {
      return this.d;
   }

   public bsv d() {
      return this.e;
   }
}
