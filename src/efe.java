import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class efe extends efi {
   public static final Codec<efe> a = efa.b.listOf().fieldOf("rules").xmap(efe::new, $$0 -> $$0.b).codec();
   private final ImmutableList<efa> b;

   public efe(List<? extends efa> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public efl.c a(cvu $$0, hz $$1, hz $$2, efl.c $$3, efl.c $$4, efh $$5) {
      awp $$6 = awp.a(awi.a($$4.a()));
      dlj $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         efa $$8 = (efa)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new efl.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected efk<?> a() {
      return efk.i;
   }
}
