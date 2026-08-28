import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Collection;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class fhj {
   public boolean a(@Nullable fhj $$0) {
      return $$0 == null ? false : this == $$0;
   }

   public abstract String c();

   public abstract xu d(xg var1);

   public abstract boolean j();

   public abstract boolean i();

   public abstract fhj.b k();

   public abstract o o();

   public abstract Collection<String> h();

   public abstract fhj.b l();

   public abstract fhj.a m();

   public static enum a implements bax {
      a("always", 0),
      b("never", 1),
      c("pushOtherTeams", 2),
      d("pushOwnTeam", 3);

      public static final Codec<fhj.a> e = bax.a(fhj.a::values);
      private static final IntFunction<fhj.a> i = ayo.a($$0 -> $$0.h, values(), ayo.a.a);
      public static final ze<ByteBuf, fhj.a> f = zc.a(i, $$0 -> $$0.h);
      public final String g;
      public final int h;

      private a(final String $$0, final int $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public xg a() {
         return xg.c("team.collision." + this.g);
      }

      @Override
      public String c() {
         return this.g;
      }
   }

   public static enum b implements bax {
      a("always", 0),
      b("never", 1),
      c("hideForOtherTeams", 2),
      d("hideForOwnTeam", 3);

      public static final Codec<fhj.b> e = bax.a(fhj.b::values);
      private static final IntFunction<fhj.b> i = ayo.a($$0 -> $$0.h, values(), ayo.a.a);
      public static final ze<ByteBuf, fhj.b> f = zc.a(i, $$0 -> $$0.h);
      public final String g;
      public final int h;

      private b(final String $$0, final int $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public xg a() {
         return xg.c("team.visibility." + this.g);
      }

      @Override
      public String c() {
         return this.g;
      }
   }
}
