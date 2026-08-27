import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class dsj extends dsd {
   public static final Codec<dsj> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsd.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               bgf.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dsj::new)
   );
   private final dsd c;
   private final String d;
   @Nullable
   private dgl e;
   private final bgf f;

   public dsj(dsd $$0, dgl $$1, bgf $$2) {
      this.c = $$0;
      this.e = $$1;
      this.d = $$1.f();
      this.f = $$2;
      Collection<Integer> $$3 = $$1.a();

      for (int $$4 = $$2.a(); $$4 <= $$2.b(); $$4++) {
         if (!$$3.contains($$4)) {
            throw new IllegalArgumentException("Property value out of range: " + $$1.f() + ": " + $$4);
         }
      }
   }

   public dsj(dsd $$0, String $$1, bgf $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected dse<?> a() {
      return dse.g;
   }

   @Override
   public dfl a(ase $$0, gw $$1) {
      dfl $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         this.e = a($$2, this.d);
      }

      return $$2.a(this.e, Integer.valueOf(this.f.a($$0)));
   }

   private static dgl a(dfl $$0, String $$1) {
      Collection<dgo<?>> $$2 = $$0.B();
      Optional<dgl> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof dgl).map($$0x -> (dgl)$$0x).findAny();
      return $$3.orElseThrow(() -> new IllegalArgumentException("Illegal property: " + $$1));
   }
}
