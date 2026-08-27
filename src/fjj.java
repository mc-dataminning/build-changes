import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface fjj extends fji {
   static fjj.a a(GameProfile $$0, tx $$1, fjh $$2) {
      return new fjj.a($$0, $$1, $$2);
   }

   static fjj.b a(ti $$0, Instant $$1) {
      return new fjj.b($$0, $$1);
   }

   ti b();

   default ti c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, tx d, fjh e) implements fjj {
      public static final Codec<fjj.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  arb.t.fieldOf("profile").forGetter(fjj.a::f), tx.a.forGetter(fjj.a::g), fjh.d.optionalFieldOf("trust_level", fjh.a).forGetter(fjj.a::h)
               )
               .apply($$0, fjj.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public ti b() {
         if (!this.d.n().a()) {
            ti $$0 = this.d.n().b(this.d.b());
            return (ti)($$0 != null ? $$0 : ti.h());
         } else {
            return this.d.c();
         }
      }

      @Override
      public ti c() {
         ti $$0 = this.b();
         ti $$1 = this.i();
         return ti.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public ti d() {
         ti $$0 = this.i();
         return ti.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private ti i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.d(), ZoneOffset.systemDefault());
         return ti.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public fji.a a() {
         return fji.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public tx g() {
         return this.d;
      }

      public fjh h() {
         return this.e;
      }
   }

   public static record b(ti c, Instant d) implements fjj {
      public static final Codec<fjj.b> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(arb.b.fieldOf("message").forGetter(fjj.b::d), arb.m.fieldOf("time_stamp").forGetter(fjj.b::e)).apply($$0, fjj.b::new)
      );

      @Override
      public ti b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public fji.a a() {
         return fji.a.b;
      }

      public ti d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
