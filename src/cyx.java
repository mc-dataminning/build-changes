import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public record cyx(List<cyx.a> e) implements cyf, cyz {
   public static final cyx a = new cyx(List.of());
   public static final int b = 160;
   public static final Codec<cyx> c = cyx.a.a.listOf().xmap(cyx::new, cyx::a);
   public static final zc<wp, cyx> d = cyx.a.b.a(za.a()).a(cyx::new, cyx::a);

   public cyx a(cyx.a $$0) {
      return new cyx(ad.a(this.e, $$0));
   }

   @Override
   public void a(dej $$0, bun $$1, cvs $$2, cye $$3) {
      for (cyx.a $$4 : this.e) {
         $$1.a($$4.a());
      }
   }

   @Override
   public void a(cvn.b $$0, Consumer<xe> $$1, cxk $$2) {
      if ($$2.b()) {
         List<bsy> $$3 = new ArrayList<>();

         for (cyx.a $$4 : this.e) {
            $$3.add($$4.a());
         }

         cxr.a($$3, $$1, 1.0F, $$0.b());
      }
   }

   public List<cyx.a> a() {
      return this.e;
   }

   public static record a(jo<bsw> c, int d) {
      public static final Codec<cyx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bsw.a.fieldOf("id").forGetter(cyx.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(cyx.a::c))
               .apply($$0, cyx.a::new)
      );
      public static final zc<wp, cyx.a> b = zc.a(bsw.b, cyx.a::b, za.h, cyx.a::c, cyx.a::new);

      public bsy a() {
         return new bsy(this.c, this.d);
      }

      public jo<bsw> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
