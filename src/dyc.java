import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dyc {
   private static final Codec<ww[]> c = wy.a
      .listOf()
      .comapFlatMap(
         $$0 -> af.a($$0, 4).map($$0x -> new ww[]{(ww)$$0x.get(0), (ww)$$0x.get(1), (ww)$$0x.get(2), (ww)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<dyc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.lenientOptionalFieldOf("filtered_messages").forGetter(dyc::d),
               cxq.q.fieldOf("color").orElse(cxq.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dyc::a)
   );
   public static final int b = 4;
   private final ww[] d;
   private final ww[] e;
   private final cxq f;
   private final boolean g;
   @Nullable
   private ayw[] h;
   private boolean i;

   public dyc() {
      this(c(), c(), cxq.p, false);
   }

   public dyc(ww[] $$0, ww[] $$1, cxq $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static ww[] c() {
      return new ww[]{wv.a, wv.a, wv.a, wv.a};
   }

   private static dyc a(ww[] $$0, Optional<ww[]> $$1, cxq $$2, boolean $$3) {
      return new dyc($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public dyc a(boolean $$0) {
      return $$0 == this.g ? this : new dyc(this.d, this.e, this.f, $$0);
   }

   public cxq b() {
      return this.f;
   }

   public dyc a(cxq $$0) {
      return $$0 == this.b() ? this : new dyc(this.d, this.e, $$0, this.g);
   }

   public ww a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public dyc a(int $$0, ww $$1) {
      return this.a($$0, $$1, $$1);
   }

   public dyc a(int $$0, ww $$1, ww $$2) {
      ww[] $$3 = Arrays.copyOf(this.d, this.d.length);
      ww[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new dyc($$3, $$4, this.f, this.g);
   }

   public boolean a(cqs $$0) {
      return Arrays.stream(this.b($$0.aa())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public ww[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public ayw[] a(boolean $$0, Function<ww, ayw> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new ayw[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<ww[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(cqs $$0) {
      for (ww $$1 : this.b($$0.aa())) {
         xt $$2 = $$1.a();
         wu $$3 = $$2.i();
         if ($$3 != null && $$3.a() == wu.a.c) {
            return true;
         }
      }

      return false;
   }
}
