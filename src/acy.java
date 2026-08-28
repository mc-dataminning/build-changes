import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.List;
import java.util.Optional;

public record acy(int b, int c, int d, List<acy.a> e) implements zr<acg> {
   public static final zi<wv, acy> a = zi.a(zg.h, acy::e, zg.h, acy::f, zg.h, acy::g, acy.a.a.a(zg.a()), acy::h, acy::new);

   public acy(int $$0, Suggestions $$1) {
      this(
         $$0,
         $$1.getRange().getStart(),
         $$1.getRange().getLength(),
         $$1.getList().stream().map($$0x -> new acy.a($$0x.getText(), Optional.ofNullable($$0x.getTooltip()).map(xn::a))).toList()
      );
   }

   @Override
   public zt<acy> a() {
      return agz.r;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public Suggestions b() {
      StringRange $$0 = StringRange.between(this.c, this.c + this.d);
      return new Suggestions($$0, this.e.stream().map($$1 -> new Suggestion($$0, $$1.a(), $$1.b().orElse(null))).toList());
   }

   public int e() {
      return this.b;
   }

   public int f() {
      return this.c;
   }

   public int g() {
      return this.d;
   }

   public List<acy.a> h() {
      return this.e;
   }

   public static record a(String b, Optional<xk> c) {
      public static final zi<wv, acy.a> a = zi.a(zg.o, acy.a::a, xm.e, acy.a::b, acy.a::new);

      public String a() {
         return this.b;
      }

      public Optional<xk> b() {
         return this.c;
      }
   }
}
