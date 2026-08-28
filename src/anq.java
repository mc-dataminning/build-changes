import com.mojang.brigadier.exceptions.CommandSyntaxException;

@FunctionalInterface
public interface anq<T, R> {
   R apply(T var1) throws CommandSyntaxException;
}
