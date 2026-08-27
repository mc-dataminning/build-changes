import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.List;
import java.util.Optional;

public record aci(int b, int c, int d, List<aci.a> e) implements ze<abq> {
   public static final yv<wi, aci> a = yv.a(yt.f, aci::e, yt.f, aci::f, yt.f, aci::g, aci.a.a.a(yt.a()), aci::h, aci::new);

   public aci(int $$0, Suggestions $$1) {
      this(
         $$0,
         $$1.getRange().getStart(),
         $$1.getRange().getLength(),
         $$1.getList().stream().map($$0x -> new aci.a($$0x.getText(), Optional.ofNullable($$0x.getTooltip()).map(xa::a))).toList()
      );
   }

   @Override
   public zg<aci> a() {
      return agb.r;
   }

   public void a(abq $$0) {
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

   public List<aci.a> h() {
      return this.e;
   }

   public static record a(String b, Optional<wx> c) {
      public static final yv<wi, aci.a> a = yv.a(yt.k, aci.a::a, wz.e, aci.a::b, aci.a::new);

      public String a() {
         return this.b;
      }

      public Optional<wx> b() {
         return this.c;
      }
   }
}
