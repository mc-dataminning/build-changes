import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.List;
import java.util.Optional;

public record acd(int b, int c, int d, List<acd.a> e) implements yw<abl> {
   public static final yn<wa, acd> a = yn.a(yl.h, acd::e, yl.h, acd::f, yl.h, acd::g, acd.a.a.a(yl.a()), acd::h, acd::new);

   public acd(int $$0, Suggestions $$1) {
      this(
         $$0,
         $$1.getRange().getStart(),
         $$1.getRange().getLength(),
         $$1.getList().stream().map($$0x -> new acd.a($$0x.getText(), Optional.ofNullable($$0x.getTooltip()).map(ws::a))).toList()
      );
   }

   @Override
   public yy<acd> a() {
      return age.r;
   }

   public void a(abl $$0) {
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

   public List<acd.a> h() {
      return this.e;
   }

   public static record a(String b, Optional<wp> c) {
      public static final yn<wa, acd.a> a = yn.a(yl.o, acd.a::a, wr.e, acd.a::b, acd.a::new);

      public String a() {
         return this.b;
      }

      public Optional<wp> b() {
         return this.c;
      }
   }
}
