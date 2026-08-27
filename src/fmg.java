import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface fmg extends fmf {
   static fmg.a a(GameProfile $$0, vl $$1, fme $$2) {
      return new fmg.a($$0, $$1, $$2);
   }

   static fmg.b a(uv $$0, Instant $$1) {
      return new fmg.b($$0, $$1);
   }

   uv b();

   default uv c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, vl d, fme e) implements fmg {
      public static final Codec<fmg.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  asy.u.fieldOf("profile").forGetter(fmg.a::f), vl.a.forGetter(fmg.a::g), fme.d.optionalFieldOf("trust_level", fme.a).forGetter(fmg.a::h)
               )
               .apply($$0, fmg.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public uv b() {
         if (!this.d.n().a()) {
            uv $$0 = this.d.n().b(this.d.b());
            return (uv)($$0 != null ? $$0 : uv.i());
         } else {
            return this.d.c();
         }
      }

      @Override
      public uv c() {
         uv $$0 = this.b();
         uv $$1 = this.i();
         return uv.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public uv d() {
         uv $$0 = this.i();
         return uv.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private uv i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.d(), ZoneOffset.systemDefault());
         return uv.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public fmf.a a() {
         return fmf.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public vl g() {
         return this.d;
      }

      public fme h() {
         return this.e;
      }
   }

   public static record b(uv c, Instant d) implements fmg {
      public static final Codec<fmg.b> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(ux.a.fieldOf("message").forGetter(fmg.b::d), asy.m.fieldOf("time_stamp").forGetter(fmg.b::e)).apply($$0, fmg.b::new)
      );

      @Override
      public uv b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public fmf.a a() {
         return fmf.a.b;
      }

      public uv d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
