import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface fjk extends fjj {
   static fjk.a a(GameProfile $$0, ub $$1, fji $$2) {
      return new fjk.a($$0, $$1, $$2);
   }

   static fjk.b a(tl $$0, Instant $$1) {
      return new fjk.b($$0, $$1);
   }

   tl b();

   default tl c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, ub d, fji e) implements fjk {
      public static final Codec<fjk.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  arj.u.fieldOf("profile").forGetter(fjk.a::f), ub.a.forGetter(fjk.a::g), fji.d.optionalFieldOf("trust_level", fji.a).forGetter(fjk.a::h)
               )
               .apply($$0, fjk.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public tl b() {
         if (!this.d.n().a()) {
            tl $$0 = this.d.n().b(this.d.b());
            return (tl)($$0 != null ? $$0 : tl.i());
         } else {
            return this.d.c();
         }
      }

      @Override
      public tl c() {
         tl $$0 = this.b();
         tl $$1 = this.i();
         return tl.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public tl d() {
         tl $$0 = this.i();
         return tl.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private tl i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.d(), ZoneOffset.systemDefault());
         return tl.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public fjj.a a() {
         return fjj.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public ub g() {
         return this.d;
      }

      public fji h() {
         return this.e;
      }
   }

   public static record b(tl c, Instant d) implements fjk {
      public static final Codec<fjk.b> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(tn.a.fieldOf("message").forGetter(fjk.b::d), arj.m.fieldOf("time_stamp").forGetter(fjk.b::e)).apply($$0, fjk.b::new)
      );

      @Override
      public tl b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public fjj.a a() {
         return fjj.a.b;
      }

      public tl d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
